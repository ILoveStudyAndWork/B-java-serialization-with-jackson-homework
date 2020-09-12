package com.thoughtworks.capability.gtb.vo;

import java.util.Date;
import java.util.logging.SimpleFormatter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thoughtworks.capability.gtb.deserializer.UserDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  private EventType type;
  @JsonFormat(shape = JsonFormat.Shape.NUMBER)
  private Date time;
  @JsonDeserialize(using = UserDeserializer.class)
  @JsonUnwrapped
  private UserVo user;

  @JsonCreator
  public EventVo(@JsonProperty("id") String id,
                 @JsonProperty("name") String name,
                 @JsonProperty("type") EventType type,
                 @JsonProperty("time") long time,
                 @JsonProperty("userId") String userId,
                 @JsonProperty("userName") String userName ) {

    this.id = id;
    this.name = name;
    this.type = type;
    this.time = new Date(time);
    this.user = new UserVo(userId, userName);
  }
}
