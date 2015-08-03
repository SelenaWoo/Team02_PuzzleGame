/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game {
    @Id @Column(name = "gameID") private Integer gameId;
    
    private int gameID;
    private int score;
    private String level;
    
    
}
