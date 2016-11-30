package eadapp.classesEntidade;

import eadapp.classesEntidade.Curso;
import eadapp.classesEntidade.Prova;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-29T20:29:48")
@StaticMetamodel(Estudante.class)
public class Estudante_ extends Conta_ {

    public static volatile ListAttribute<Estudante, Prova> provasRealizadas;
    public static volatile ListAttribute<Estudante, Curso> cursosDiplomado;
    public static volatile ListAttribute<Estudante, Curso> cursosInscritos;

}