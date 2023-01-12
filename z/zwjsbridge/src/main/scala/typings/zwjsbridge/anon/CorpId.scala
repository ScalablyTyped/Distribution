package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorpId extends StObject {
  
  /** 电话号码 */
  var corpId: String
}
object CorpId {
  
  inline def apply(corpId: String): CorpId = {
    val __obj = js.Dynamic.literal(corpId = corpId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorpId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CorpId] (val x: Self) extends AnyVal {
    
    inline def setCorpId(value: String): Self = StObject.set(x, "corpId", value.asInstanceOf[js.Any])
  }
}
