package typings.youtubePlayer.typesMod

import typings.youtubePlayer.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IframeApiType extends js.Object {
  var Player: Instantiable
}

object IframeApiType {
  @scala.inline
  def apply(Player: Instantiable): IframeApiType = {
    val __obj = js.Dynamic.literal(Player = Player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IframeApiType]
  }
}

