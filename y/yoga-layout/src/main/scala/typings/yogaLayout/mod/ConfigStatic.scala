package typings.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigStatic extends js.Object {
  
  def create(): YogaConfig = js.native
  
  def destroy(config: YogaConfig): js.Any = js.native
}
object ConfigStatic {
  
  @scala.inline
  def apply(create: () => YogaConfig, destroy: YogaConfig => js.Any): ConfigStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[ConfigStatic]
  }
  
  @scala.inline
  implicit class ConfigStaticOps[Self <: ConfigStatic] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: () => YogaConfig): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: YogaConfig => js.Any): Self = this.set("destroy", js.Any.fromFunction1(value))
  }
}
