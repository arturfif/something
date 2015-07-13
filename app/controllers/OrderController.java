package controllers;

import models.session.Order;
import models.session.Room;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.orderForm;
import views.html.orderTable;

import java.util.Date;
import java.util.Calendar;
import java.time.*;

/**
 * Created by arturk on 06.07.2015.
 */
public class OrderController extends Controller {

    public Result createOrder() {
        return ok(orderForm.render());
    }

    public Result addOrder() {
        if(validateOrder(Form.form().bindFromRequest())) {
            Order order = Form.form(Order.class).bindFromRequest().get();
            //order.status = models.session.Status.PRE_ORDER;
            order.save();
            return redirect(routes.OrderController.createOrder());
        }
        return redirect(routes.OrderController.createOrder());
    }

    private boolean validateOrder(DynamicForm form) {
        Long roomId = Long.parseLong(form.get("roomId"));
        if (Room.find.byId(roomId) == null) {
            return false;
        }
        return true;
    }

    public Result showOrderTable() {
        Calendar calendar = Calendar.getInstance();
        return ok(orderTable.render(calendar));
    }

}
