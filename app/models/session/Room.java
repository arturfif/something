package models.session;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by arturk on 07.07.2015.
 */
@Entity
@Table(name = "room")
public class Room extends Model {
    @Id
    @OneToMany(mappedBy="roomId")
    public Long id;

    @Column(unique = true, nullable = false)
    public String name;

    public Integer weekdaysScheduleId;

    public Integer weekendsScheduleId;

    @Column(nullable = false)
    public String city;

    @Column(nullable = false)
    public String address;

    public static Model.Finder<Long, Room> find = new Model.Finder<>(Room.class);
}
