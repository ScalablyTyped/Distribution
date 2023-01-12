package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserType extends StObject {
  
  /**
    * 用户类型，取值: 0:公务员 1:除公务员以外的个人 2:法人
    * 公务员属于特殊类型的个人用户，当应用服务需要同时支持个人和法人时，可通过getUserType接口获取APP当前登录用户类型，然后发起个人或法人的登录认证，0或1都属于个人用户，2为法人用户。
    */
  var userType: String
}
object UserType {
  
  inline def apply(userType: String): UserType = {
    val __obj = js.Dynamic.literal(userType = userType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserType] (val x: Self) extends AnyVal {
    
    inline def setUserType(value: String): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
  }
}
