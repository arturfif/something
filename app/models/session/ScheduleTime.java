package models.session;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by arturk on 08.07.2015.
 */
@Entity
@Table(name = "schedule_time")
public class ScheduleTime extends Model {
    @Id
    @GeneratedValue
    public Long id;

    public Integer sheduleId;

    public Integer timeId;

    public static Model.Finder<Long, ScheduleTime> find = new Model.Finder<>(ScheduleTime.class);

}
