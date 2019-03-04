package typings
package youtubeDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var list: js.UndefOr[java.lang.String] = js.undefined
  var listType: java.lang.String
  var startSeconds: js.UndefOr[scala.Double] = js.undefined
  var suggestedQuality: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(
    listType: java.lang.String,
    index: scala.Int | scala.Double = null,
    list: java.lang.String = null,
    startSeconds: scala.Int | scala.Double = null,
    suggestedQuality: java.lang.String = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal(listType = listType)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality)
    __obj.asInstanceOf[Anon_Index]
  }
}

