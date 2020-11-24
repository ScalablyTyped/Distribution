package typings.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextPrefix extends js.Object {
  
  var contextPrefix: String = js.native
}
object ContextPrefix {
  
  @scala.inline
  def apply(contextPrefix: String): ContextPrefix = {
    val __obj = js.Dynamic.literal(contextPrefix = contextPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextPrefix]
  }
  
  @scala.inline
  implicit class ContextPrefixOps[Self <: ContextPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContextPrefix(value: String): Self = this.set("contextPrefix", value.asInstanceOf[js.Any])
  }
}
