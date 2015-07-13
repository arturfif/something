package controllers;

import models.session.Room;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.roomForm;

/**
 * Created by arturk on 11.07.2015.
 */
public class RoomController extends Controller {

    public Result rooms() {
        return play.mvc.Results.TODO;
    }


    public Result createRoom() {
        return ok(roomForm.render());
    }

//    public Result addRoom() {
//        Room room = Form.form(Room.class).bindFromRequest().get();
//        room.save();
//        return redirect(routes.RoomController.rooms());
//    }

    public Result listRooms() {
        return TODO;
    }

    public Result updateRoom() {
        return TODO;
    }
}
