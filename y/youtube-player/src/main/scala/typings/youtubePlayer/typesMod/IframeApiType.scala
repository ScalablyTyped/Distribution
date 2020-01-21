package typings.youtubePlayer.typesMod

import typings.youtubePlayer.AnonElementId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IframeApiType extends js.Object {
  var Player: AnonElementId
}

object IframeApiType {
  @scala.inline
  def apply(Player: AnonElementId): IframeApiType = {
    val __obj = js.Dynamic.literal(Player = Player.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IframeApiType]
  }
}

