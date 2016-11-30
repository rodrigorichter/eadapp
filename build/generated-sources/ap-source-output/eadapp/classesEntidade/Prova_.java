package eadapp.classesEntidade;

import eadapp.classesEntidade.Curso;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-29T20:29:48")
@StaticMetamodel(Prova.class)
public class Prova_ { 

    public static volatile SingularAttribute<Prova, Boolean> estaDisponivel;
    public static volatile SingularAttribute<Prova, Curso> curso;
    public static volatile SingularAttribute<Prova, Map> questoes;
    public static volatile SingularAttribute<Prova, Long> id;
    public static volatile SingularAttribute<Prova, Integer> tempoMaximo;

}