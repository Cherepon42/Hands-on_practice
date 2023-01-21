package hibernate4.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "children_section", joinColumns = @JoinColumn(name = "children_id"), inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    public Child() {
    }

    public Child(String name) {
        this.name = name;
    }

    public void addSection(Section section) {
        if (sections == null) {
            sections = new ArrayList<>();
        }
        sections.add(section);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}