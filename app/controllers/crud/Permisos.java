/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers.crud;

import controllers.CRUD;
/**
 *
 * @author jesus
 */
@With(Secure.class)
@Check("administrador")
public class Permisos extends CRUD{

}
