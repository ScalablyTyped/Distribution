package typings.yui.Y

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfig extends js.Object {
  
  var optional: js.Array[String] = js.native
  
  var requires: js.Array[String] = js.native
  
  var use: js.Array[String] = js.native
}
object IConfig {
  
  @scala.inline
  def apply(optional: js.Array[String], requires: js.Array[String], use: js.Array[String]): IConfig = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    
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
    def setOptionalVarargs(value: String*): Self = this.set("optional", js.Array(value :_*))
    
    @scala.inline
    def setOptional(value: js.Array[String]): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresVarargs(value: String*): Self = this.set("requires", js.Array(value :_*))
    
    @scala.inline
    def setRequires(value: js.Array[String]): Self = this.set("requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseVarargs(value: String*): Self = this.set("use", js.Array(value :_*))
    
    @scala.inline
    def setUse(value: js.Array[String]): Self = this.set("use", value.asInstanceOf[js.Any])
  }
}
