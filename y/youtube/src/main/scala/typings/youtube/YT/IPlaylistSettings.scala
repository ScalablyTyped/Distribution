package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaylistSettings extends VideoOrPlaylistSettings {
  /**
    * Start index of the playlist, if not 0.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Identifier for the listType videos list.
    */
  var list: String = js.native
  /**
    * Which type of content loads in the player.
    */
  var listType: js.UndefOr[ListType] = js.native
}

object IPlaylistSettings {
  @scala.inline
  def apply(list: String): IPlaylistSettings = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaylistSettings]
  }
  @scala.inline
  implicit class IPlaylistSettingsOps[Self <: IPlaylistSettings] (val x: Self) extends AnyVal {
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
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setListType(value: ListType): Self = this.set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListType: Self = this.set("listType", js.undefined)
  }
  
}

