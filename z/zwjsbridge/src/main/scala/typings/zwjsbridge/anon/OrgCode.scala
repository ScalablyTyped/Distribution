package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgCode extends StObject {
  
  var cityId: String
  
  /** 城市名称 */
  var cityName: String
  
  var orgCode: String
  
  var webId: String
}
object OrgCode {
  
  inline def apply(cityId: String, cityName: String, orgCode: String, webId: String): OrgCode = {
    val __obj = js.Dynamic.literal(cityId = cityId.asInstanceOf[js.Any], cityName = cityName.asInstanceOf[js.Any], orgCode = orgCode.asInstanceOf[js.Any], webId = webId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgCode] (val x: Self) extends AnyVal {
    
    inline def setCityId(value: String): Self = StObject.set(x, "cityId", value.asInstanceOf[js.Any])
    
    inline def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
    
    inline def setOrgCode(value: String): Self = StObject.set(x, "orgCode", value.asInstanceOf[js.Any])
    
    inline def setWebId(value: String): Self = StObject.set(x, "webId", value.asInstanceOf[js.Any])
  }
}
