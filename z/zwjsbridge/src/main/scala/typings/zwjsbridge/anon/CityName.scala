package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CityName extends StObject {
  
  /** 城市名称 */
  var cityName: String
  
  /** 详细地址 */
  var detailAddress: String
  
  /** 纬度 */
  var latitude: Double
  
  /** 经度 */
  var longitude: Double
  
  /** 区域名称 */
  var region: String
  
  /** 地区编码 */
  var townCode: String
}
object CityName {
  
  inline def apply(
    cityName: String,
    detailAddress: String,
    latitude: Double,
    longitude: Double,
    region: String,
    townCode: String
  ): CityName = {
    val __obj = js.Dynamic.literal(cityName = cityName.asInstanceOf[js.Any], detailAddress = detailAddress.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], townCode = townCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CityName] (val x: Self) extends AnyVal {
    
    inline def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
    
    inline def setDetailAddress(value: String): Self = StObject.set(x, "detailAddress", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setTownCode(value: String): Self = StObject.set(x, "townCode", value.asInstanceOf[js.Any])
  }
}
