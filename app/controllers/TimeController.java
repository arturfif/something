package controllers;

import models.session.Time;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.timeTable;

import java.time.LocalTime;
import java.util.List;


/**
 * Created by arturk on 12.07.2015.
 */
public class TimeController extends Controller {
    public Result showTimeTable() {
        List<Time> timeList = Time.find.all();
        return ok(timeTable.render(timeList));
    }

    public Result addTime() {
        LocalTime localTime = LocalTime.parse(Form.form(Time.class).bindFromRequest().data().get("time")) ;
        Time time = new Time();
        time.time = localTime;
        time.save();
        return redirect(routes.TimeController.showTimeTable());
    }
}
