package controllers.crud;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controllers.CRUD;
import controllers.Secure;
import controllers.Check;
import play.mvc.With;

/**
 *
 * @author jesus
 */
@With(Secure.class)
@Check("administrador")
public class ExpedienteMedicos extends CRUD{

}