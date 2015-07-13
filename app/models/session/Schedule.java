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
@Table(name = "schedule")
public class Schedule extends Model {
    @Id
    @GeneratedValue
    public Long id;

    public String comment;

    public static Model.Finder<Long, Schedule> find = new Model.Finder<>(Schedule.class);

}
