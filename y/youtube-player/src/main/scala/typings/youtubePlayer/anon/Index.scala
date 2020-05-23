package typings.youtubePlayer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var listType: String
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[String] = js.undefined
}

object Index {
  @scala.inline
  def apply(
    listType: String,
    index: js.UndefOr[Double] = js.undefined,
    list: String = null,
    startSeconds: js.UndefOr[Double] = js.undefined,
    suggestedQuality: String = null
  ): Index = {
    val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(startSeconds)) __obj.updateDynamic("startSeconds")(startSeconds.get.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

