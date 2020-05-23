package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * treeview
  */
trait TreeNode extends js.Object {
  var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object TreeNode {
  @scala.inline
  def apply(
    children: js.Array[TreeNode] = null,
    html: String = null,
    id: String = null,
    open: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    url: String = null
  ): TreeNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
}

