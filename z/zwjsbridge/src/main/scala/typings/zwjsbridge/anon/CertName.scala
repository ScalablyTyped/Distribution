package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertName extends StObject {
  
  /** 姓名，默认值为当前登录账号所属名字 */
  var certName: js.UndefOr[String] = js.undefined
  
  /** 身份证号，默认值为当前登录账号所属身份证号码 */
  var certNo: js.UndefOr[String] = js.undefined
}
object CertName {
  
  inline def apply(): CertName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertName] (val x: Self) extends AnyVal {
    
    inline def setCertName(value: String): Self = StObject.set(x, "certName", value.asInstanceOf[js.Any])
    
    inline def setCertNameUndefined: Self = StObject.set(x, "certName", js.undefined)
    
    inline def setCertNo(value: String): Self = StObject.set(x, "certNo", value.asInstanceOf[js.Any])
    
    inline def setCertNoUndefined: Self = StObject.set(x, "certNo", js.undefined)
  }
}
