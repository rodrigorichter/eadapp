package eadapp.classesEntidade;

import eadapp.classesEntidade.Estudante;
import eadapp.classesEntidade.Professor;
import eadapp.classesEntidade.Prova;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-29T20:29:48")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile ListAttribute<Curso, Estudante> alunosPediramInscricao;
    public static volatile ListAttribute<Curso, Prova> provas;
    public static volatile SingularAttribute<Curso, Professor> professor;
    public static volatile ListAttribute<Curso, Estudante> alunosPediramDiplomacao;
    public static volatile SingularAttribute<Curso, String> nome;
    public static volatile SingularAttribute<Curso, List> links;
    public static volatile SingularAttribute<Curso, Long> id;
    public static volatile ListAttribute<Curso, Estudante> alunosDiplomados;
    public static volatile SingularAttribute<Curso, String> descricao;
    public static volatile ListAttribute<Curso, Estudante> alunosInscritos;

}