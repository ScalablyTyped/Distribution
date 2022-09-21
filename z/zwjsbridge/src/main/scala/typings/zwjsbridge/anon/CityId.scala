package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CityId extends StObject {
  
  /** 行政区划编码 */
  var cityId: String
  
  /** 行政区划名 */
  var cityName: String
  
  var orgCode: String
  
  var webId: String
}
object CityId {
  
  inline def apply(cityId: String, cityName: String, orgCode: String, webId: String): CityId = {
    val __obj = js.Dynamic.literal(cityId = cityId.asInstanceOf[js.Any], cityName = cityName.asInstanceOf[js.Any], orgCode = orgCode.asInstanceOf[js.Any], webId = webId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityId]
  }
  
  extension [Self <: CityId](x: Self) {
    
    inline def setCityId(value: String): Self = StObject.set(x, "cityId", value.asInstanceOf[js.Any])
    
    inline def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
    
    inline def setOrgCode(value: String): Self = StObject.set(x, "orgCode", value.asInstanceOf[js.Any])
    
    inline def setWebId(value: String): Self = StObject.set(x, "webId", value.asInstanceOf[js.Any])
  }
}
