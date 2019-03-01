package typings
package youtubeDashPlayerLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IframeApiType extends js.Object {
  var Player: youtubeDashPlayerLib.Anon_ElementId
}

object IframeApiType {
  @scala.inline
  def apply(Player: youtubeDashPlayerLib.Anon_ElementId): IframeApiType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Player")(Player)
    __obj.asInstanceOf[IframeApiType]
  }
}

