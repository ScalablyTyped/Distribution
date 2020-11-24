package typings.youtubePlayer.typesMod

import typings.youtubePlayer.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IframeApiType extends js.Object {
  
  var Player: Instantiable = js.native
}
object IframeApiType {
  
  @scala.inline
  def apply(Player: Instantiable): IframeApiType = {
    val __obj = js.Dynamic.literal(Player = Player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IframeApiType]
  }
  
  @scala.inline
  implicit class IframeApiTypeOps[Self <: IframeApiType] (val x: Self) extends AnyVal {
    
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
    def setPlayer(value: Instantiable): Self = this.set("Player", value.asInstanceOf[js.Any])
  }
}
