package typings.zookeeper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * stat
  */
trait stat extends StObject {
  
  var aversion: Double
  
  var ctime: Double
  
  var cversion: Double
  
  var czxid: Double
  
  var dataLength: Double
  
  var ephemeralOwner: String
  
  var mtime: Double
  
  var mzxid: Double
  
  var numChildren: Double
  
  var pzxid: Double
  
  var version: Double
}
object stat {
  
  inline def apply(
    aversion: Double,
    ctime: Double,
    cversion: Double,
    czxid: Double,
    dataLength: Double,
    ephemeralOwner: String,
    mtime: Double,
    mzxid: Double,
    numChildren: Double,
    pzxid: Double,
    version: Double
  ): stat = {
    val __obj = js.Dynamic.literal(aversion = aversion.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], cversion = cversion.asInstanceOf[js.Any], czxid = czxid.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], ephemeralOwner = ephemeralOwner.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mzxid = mzxid.asInstanceOf[js.Any], numChildren = numChildren.asInstanceOf[js.Any], pzxid = pzxid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[stat]
  }
  
  extension [Self <: stat](x: Self) {
    
    inline def setAversion(value: Double): Self = StObject.set(x, "aversion", value.asInstanceOf[js.Any])
    
    inline def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setCversion(value: Double): Self = StObject.set(x, "cversion", value.asInstanceOf[js.Any])
    
    inline def setCzxid(value: Double): Self = StObject.set(x, "czxid", value.asInstanceOf[js.Any])
    
    inline def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
    
    inline def setEphemeralOwner(value: String): Self = StObject.set(x, "ephemeralOwner", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMzxid(value: Double): Self = StObject.set(x, "mzxid", value.asInstanceOf[js.Any])
    
    inline def setNumChildren(value: Double): Self = StObject.set(x, "numChildren", value.asInstanceOf[js.Any])
    
    inline def setPzxid(value: Double): Self = StObject.set(x, "pzxid", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
