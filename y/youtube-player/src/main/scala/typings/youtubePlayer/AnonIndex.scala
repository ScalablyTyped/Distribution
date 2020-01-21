package typings.youtubePlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var listType: String
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[String] = js.undefined
}

object AnonIndex {
  @scala.inline
  def apply(
    listType: String,
    index: Int | Double = null,
    list: String = null,
    startSeconds: Int | Double = null,
    suggestedQuality: String = null
  ): AnonIndex = {
    val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

