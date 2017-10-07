package examples.quickstart.mysql.pojo;

import org.plasma.sdo.annotation.Alias;
import org.plasma.sdo.annotation.Enumeration;

@Enumeration(name = "OrgCat")
public enum OrgCat {
  @Alias(physicalName = "N")
  nonprofit, 
  @Alias(physicalName = "G")
  government,
  @Alias(physicalName = "R")
  retail, 
  @Alias(physicalName = "W")
  wholesale
}
