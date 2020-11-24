package typings.zipWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait zipOptions extends js.Object {
  
  /**
    * Force ZIP64 format. ZIP64 format is enabled by default where necessary.
    * See https://github.com/thejoshwolfe/yazl#regarding-zip64-support
    */
  var forceZip64Format: js.UndefOr[Boolean] = js.native
}
object zipOptions {
  
  @scala.inline
  def apply(): zipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[zipOptions]
  }
  
  @scala.inline
  implicit class zipOptionsOps[Self <: zipOptions] (val x: Self) extends AnyVal {
    
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
    def setForceZip64Format(value: Boolean): Self = this.set("forceZip64Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceZip64Format: Self = this.set("forceZip64Format", js.undefined)
  }
}
