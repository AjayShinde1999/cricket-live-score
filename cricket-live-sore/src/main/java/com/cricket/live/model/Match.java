package com.cricket.live.model;



import lombok.Data;

import java.util.Date;

@Data
//@Entity
//@Table(name = "crick_match")
public class Match {

  //  @Id
  //  private int matchId;
    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
    private String textComplete;
    private MatchStatus status;
    private Date date=new Date();

    public void setMatchStatus() {
        if (this.textComplete.trim().isBlank()) {
            this.status = MatchStatus.LIVE;
        } else {
            this.status = MatchStatus.COMPLETED;
        }
    }
}
