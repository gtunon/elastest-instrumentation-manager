/**
 * Copyright (c) 2017 Atos
 * This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0
 * which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *    @author David Rojo Antona (Atos)
 * 
 * OpenAPI spec version: 1.0.0
 * 
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * 
 * Developed in the context of ElasTest EU project http://elastest.io 
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgentConfigurationFilebeat;
import io.swagger.model.AgentConfigurationPacketbeat;
import io.swagger.model.AgentConfigurationTopbeat;
import javax.validation.constraints.*;

/**
 * This entity defines the configuration that will be applied to the agent
 */
@ApiModel(description = "This entity defines the configuration that will be applied to the agent")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T18:55:29.616+01:00")
public class AgentConfiguration   {
  @JsonProperty("exec")
  private String exec = null;

  @JsonProperty("component")
  private String component = null;

  @JsonProperty("packetbeat")
  private AgentConfigurationPacketbeat packetbeat = null;

  @JsonProperty("filebeat")
  private AgentConfigurationFilebeat filebeat = null;

  @JsonProperty("topbeat")
  private AgentConfigurationTopbeat topbeat = null;

  public AgentConfiguration exec(String exec) {
    this.exec = exec;
    return this;
  }

  /**
   * Get exec
   * @return exec
   **/
  @JsonProperty("exec")
  @ApiModelProperty(example = "exec_name", required = true, value = "")
  @NotNull
  public String getExec() {
    return exec;
  }

  public void setExec(String exec) {
    this.exec = exec;
  }

  public AgentConfiguration component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Get component
   * @return component
   **/
  @JsonProperty("component")
  @ApiModelProperty(example = "component_name", required = true, value = "")
  @NotNull
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public AgentConfiguration packetbeat(AgentConfigurationPacketbeat packetbeat) {
    this.packetbeat = packetbeat;
    return this;
  }

  /**
   * Get packetbeat
   * @return packetbeat
   **/
  @JsonProperty("packetbeat")
  @ApiModelProperty(value = "")
  public AgentConfigurationPacketbeat getPacketbeat() {
    return packetbeat;
  }

  public void setPacketbeat(AgentConfigurationPacketbeat packetbeat) {
    this.packetbeat = packetbeat;
  }

  public AgentConfiguration filebeat(AgentConfigurationFilebeat filebeat) {
    this.filebeat = filebeat;
    return this;
  }

  /**
   * Get filebeat
   * @return filebeat
   **/
  @JsonProperty("filebeat")
  @ApiModelProperty(value = "")
  public AgentConfigurationFilebeat getFilebeat() {
    return filebeat;
  }

  public void setFilebeat(AgentConfigurationFilebeat filebeat) {
    this.filebeat = filebeat;
  }

  public AgentConfiguration topbeat(AgentConfigurationTopbeat topbeat) {
    this.topbeat = topbeat;
    return this;
  }

  /**
   * Get topbeat
   * @return topbeat
   **/
  @JsonProperty("topbeat")
  @ApiModelProperty(value = "")
  public AgentConfigurationTopbeat getTopbeat() {
    return topbeat;
  }

  public void setTopbeat(AgentConfigurationTopbeat topbeat) {
    this.topbeat = topbeat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentConfiguration agentConfiguration = (AgentConfiguration) o;
    return Objects.equals(this.exec, agentConfiguration.exec) &&
        Objects.equals(this.component, agentConfiguration.component) &&
        Objects.equals(this.packetbeat, agentConfiguration.packetbeat) &&
        Objects.equals(this.filebeat, agentConfiguration.filebeat) &&
        Objects.equals(this.topbeat, agentConfiguration.topbeat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, component, packetbeat, filebeat, topbeat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentConfiguration {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    packetbeat: ").append(toIndentedString(packetbeat)).append("\n");
    sb.append("    filebeat: ").append(toIndentedString(filebeat)).append("\n");
    sb.append("    topbeat: ").append(toIndentedString(topbeat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
