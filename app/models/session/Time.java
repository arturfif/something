package models.session;

import com.avaje.ebean.Model;
import play.data.format.Formats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

/**
 * Created by arturk on 08.07.2015.
 */
@Entity
@Table(name = "time")
public class Time extends Model {

    @Id
    @GeneratedValue
    public Long id;

    @Formats.DateTime(pattern = "hh:mm")
    public LocalTime time;

    public static Model.Finder<Long, Time> find = new Model.Finder<>(Time.class);

}
