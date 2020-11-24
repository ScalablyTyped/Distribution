package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffixOptions extends js.Object {
  
  var offset: js.UndefOr[Double | CallBack | js.Object] = js.native
  
  var target: js.UndefOr[js.Any] = js.native
}
object AffixOptions {
  
  @scala.inline
  def apply(): AffixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffixOptions]
  }
  
  @scala.inline
  implicit class AffixOptionsOps[Self <: AffixOptions] (val x: Self) extends AnyVal {
    
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
    def setOffsetFunction0(value: () => Unit): Self = this.set("offset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffset(value: Double | CallBack | js.Object): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
