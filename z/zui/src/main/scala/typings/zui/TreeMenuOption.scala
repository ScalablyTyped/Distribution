package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeMenuOption extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Array[TreeNode]] = js.native
  var initialState: js.UndefOr[String] = js.native
  var itemCreator: js.UndefOr[js.Function2[/* li */ JQuery | js.Object, /* item */ TreeNode, _]] = js.native
  var itemWrapper: js.UndefOr[Boolean] = js.native
}

object TreeMenuOption {
  @scala.inline
  def apply(): TreeMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMenuOption]
  }
  @scala.inline
  implicit class TreeMenuOptionOps[Self <: TreeMenuOption] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setDataVarargs(value: TreeNode*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[TreeNode]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setInitialState(value: String): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setItemCreator(value: (/* li */ JQuery | js.Object, /* item */ TreeNode) => _): Self = this.set("itemCreator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemCreator: Self = this.set("itemCreator", js.undefined)
    @scala.inline
    def setItemWrapper(value: Boolean): Self = this.set("itemWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWrapper: Self = this.set("itemWrapper", js.undefined)
  }
  
}

