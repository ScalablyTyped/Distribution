package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaylistSettings extends VideoOrPlaylistSettings {
  /**
    * Start index of the playlist, if not 0.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Identifier for the listType videos list.
    */
  var list: String
  /**
    * Which type of content loads in the player.
    */
  var listType: js.UndefOr[ListType] = js.undefined
}

object IPlaylistSettings {
  @scala.inline
  def apply(
    list: String,
    endSeconds: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    listType: ListType = null,
    startSeconds: js.UndefOr[Double] = js.undefined,
    suggestedQuality: SuggestedVideoQuality = null
  ): IPlaylistSettings = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    if (!js.isUndefined(endSeconds)) __obj.updateDynamic("endSeconds")(endSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (!js.isUndefined(startSeconds)) __obj.updateDynamic("startSeconds")(startSeconds.get.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaylistSettings]
  }
}

