package typings.zipWebpackPlugin.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fileOptions extends js.Object {
  /**
    * Whether to compress the out[ut zip file.
    * When true, the file data will be deflated (compression method 8).
    * When false, the file data will be stored (compression method 0).
    */
  var compress: js.UndefOr[Boolean] = js.native
  /**
    * Force ZIP64 format. ZIP64 format is enabled by default where necessary.
    * See https://github.com/thejoshwolfe/yazl#regarding-zip64-support
    */
  var forceZip64Format: js.UndefOr[Boolean] = js.native
  /**
    * UNIX permission bits and file type.
    */
  var mode: js.UndefOr[Double] = js.native
  /**
    * Overwrite the last modified time.
    * Defaults to the current date and time.
    */
  var mtime: js.UndefOr[Date] = js.native
}

object fileOptions {
  @scala.inline
  def apply(): fileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[fileOptions]
  }
  @scala.inline
  implicit class fileOptionsOps[Self <: fileOptions] (val x: Self) extends AnyVal {
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
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setForceZip64Format(value: Boolean): Self = this.set("forceZip64Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceZip64Format: Self = this.set("forceZip64Format", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
  }
  
}

