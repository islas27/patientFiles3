/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;
import models.deadbolt.Role;
import models.deadbolt.RoleHolder;

/**
 *
 * @author jesus
 */
@Entity
public class Usuario extends Model implements RoleHolder{

    public String email;

    public String name;

    @Column(name="last_name")
    public String lastName;

    public String password;

    public Date birthday;

    @ManyToOne
    public Rol rol;
}
