package typings.zeditUpf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleInfo extends js.Object {
  
  /**
    * The author(s) of the module.
    */
  var author: String = js.native
  
  /**
    * boolean specifying whether or not the module can be hot loaded.
    * Hot loading is when a module is loaded after zEdit has started.
    * Modules cannot be hot loaded if they use `ngapp`.
    *
    * @default false
    */
  var canHotLoad: js.UndefOr[Boolean] = js.native
  
  /**
    * Short description of the module.
    */
  var description: String = js.native
  
  /**
    * The module's unique identifier.
    */
  var id: String = js.native
  
  /**
    * string specifying the module loader your module should be loaded with.
    *
    * @default default
    */
  var moduleLoader: js.UndefOr[String] = js.native
  
  /**
    * The module's display name.
    * This is the name displayed in the Manage Extensions Modal.
    */
  var name: String = js.native
  
  /**
    * `MM/DD/YYYY` date string corresponding to when the module was initially released.
    */
  var released: String = js.native
  
  /**
    * array of the module id strings which your module requires to function properly.
    *
    * @default []
    */
  var requires: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * `MM/DD/YYYY` date string corresponding to when the module was last updated.
    */
  var updated: String = js.native
  
  /**
    * Version string for the module.
    */
  var version: String = js.native
}
object ModuleInfo {
  
  @scala.inline
  def apply(
    author: String,
    description: String,
    id: String,
    name: String,
    released: String,
    updated: String,
    version: String
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleInfo]
  }
  
  @scala.inline
  implicit class ModuleInfoOps[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleased(value: String): Self = this.set("released", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanHotLoad(value: Boolean): Self = this.set("canHotLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanHotLoad: Self = this.set("canHotLoad", js.undefined)
    
    @scala.inline
    def setModuleLoader(value: String): Self = this.set("moduleLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleLoader: Self = this.set("moduleLoader", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: String*): Self = this.set("requires", js.Array(value :_*))
    
    @scala.inline
    def setRequires(value: js.Array[String]): Self = this.set("requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequires: Self = this.set("requires", js.undefined)
  }
}
