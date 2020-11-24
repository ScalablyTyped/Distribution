package typings.zumly.anon

import typings.zumly.zumlyStrings.blur
import typings.zumly.zumlyStrings.height
import typings.zumly.zumlyStrings.saturate
import typings.zumly.zumlyStrings.sepia
import typings.zumly.zumlyStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cover extends js.Object {
  
  // How new injected view is adapted. String. Default 'width'
  var cover: height | width = js.native
  
  // Transition duration. Default '1s'
  var duration: String = js.native
  
  // Transition ease. Default 'ease-in-out'
  var ease: String = js.native
  
  // Effects for background views
  var effects: js.Array[blur | sepia | saturate] = js.native
}
object Cover {
  
  @scala.inline
  def apply(cover: height | width, duration: String, ease: String, effects: js.Array[blur | sepia | saturate]): Cover = {
    val __obj = js.Dynamic.literal(cover = cover.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cover]
  }
  
  @scala.inline
  implicit class CoverOps[Self <: Cover] (val x: Self) extends AnyVal {
    
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
    def setCover(value: height | width): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEase(value: String): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsVarargs(value: (blur | sepia | saturate)*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[blur | sepia | saturate]): Self = this.set("effects", value.asInstanceOf[js.Any])
  }
}
