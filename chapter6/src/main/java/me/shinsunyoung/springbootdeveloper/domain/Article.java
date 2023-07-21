package me.shinsunyoung.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder //객체를 유연하고 직관적으로 생성할 수 있음!, 어느 필드에 어떤 값이 들어가는지 명시적으로 파악할 수 있음!
    //빌더 패턴을 사용하지 않았을 때 new Article("abc", "def");
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }



    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
