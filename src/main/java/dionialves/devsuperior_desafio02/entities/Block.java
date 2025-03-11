package dionialves.devsuperior_desafio02.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant startTime;

    // @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endTime;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Block() {
    }

    public Block(Long id, Instant start, Instant end, Activity activity) {
        this.id = id;
        this.startTime = start;
        this.endTime = end;
        this.activity = activity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant start) {
        this.startTime = start;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant end) {
        this.endTime = end;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
