package angiprestano.FirstProgect1.entities;

import angiprestano.FirstProgect1.entities.Enum.StateOrders;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="orders")
public class Orders{
    @Entity
    @Table(name="orders")
    public class Orders{
        @Id
        @GeneratedValue
        private long id;
        @Enumerated(EnumType.STRING)
        @Column(name = "state_order", nullable = false)
        private StateOrders stateOrders;
        @Column(name = "number_covered", nullable = false)
        private int numberCovered;
        @Column(name = "acquisition_time", nullable = false)
        private LocalTime acquisitionTime;
        @ManyToOne
        @JoinColumn(name = "table_id", nullable = false)
        private Tables table;
}
