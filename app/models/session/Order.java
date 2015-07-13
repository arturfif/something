package models.session;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.time.LocalDate;


/**
 * Created by arturk on 05.07.2015.
 */
@Entity
@Table(name = "session_order")
public class Order extends Model {

    @Id
    @GeneratedValue
    public Long id;

    @ManyToOne
    @Column(nullable = false)
    @Constraints.Required
    public Integer roomId;

    @Constraints.Required
    public String clientName;

    @Constraints.Email
    public String email;

    @Constraints.Required
    @Constraints.MaxLength(value = 10)
    public String phoneNumber;

    @Formats.DateTime(pattern = "yyyy-MM-dd")
    public LocalDate date;

    @Constraints.Required
    public Integer timeId;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public Status status = Status.PRE_ORDER;


    public static Model.Finder<Long, Order> find = new Model.Finder<>(Order.class);
}
