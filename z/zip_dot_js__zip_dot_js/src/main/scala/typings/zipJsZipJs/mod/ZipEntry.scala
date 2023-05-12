package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an entry in a zip file (Filesystem API).
  */
@js.native
trait ZipEntry extends StObject {
  
  /**
    * Tests the password on the entry and all children if any, returns `true` if the entry is not password protected
    */
  def checkPassword(password: String): js.Promise[Boolean] = js.native
  def checkPassword(password: String, options: EntryGetDataOptions): js.Promise[Boolean] = js.native
  
  /**
    * The children of the entry.
    */
  var children: js.Array[ZipEntry] = js.native
  
  def clone(deepClone: Boolean): ZipEntry = js.native
  
  /**
    * The underlying {@link EntryMetaData} instance.
    */
  var data: js.UndefOr[EntryMetaData] = js.native
  
  /**
    * Returns the full filename of the entry
    */
  def getFullname(): String = js.native
  
  /**
    * Returns the filename of the entry relative to a parent directory
    */
  def getRelativeName(ancestor: ZipDirectoryEntry): String = js.native
  
  /**
    * The ID of the instance.
    */
  var id: Double = js.native
  
  /**
    * Tests if a {@link ZipDirectoryEntry} instance is an ancestor of the entry
    *
    * @param ancestor The {@link ZipDirectoryEntry} instance.
    */
  def isDescendantOf(ancestor: ZipDirectoryEntry): Boolean = js.native
  
  /**
    * Tests if the entry or any of its children is password protected
    */
  def isPasswordProtected(): Boolean = js.native
  
  /**
    * The relative filename of the entry.
    */
  var name: String = js.native
  
  /**
    * The parent directory of the entry.
    */
  var parent: js.UndefOr[ZipEntry] = js.native
  
  /**
    * Set the name of the entry
    *
    * @param name The new name of the netry.
    */
  def rename(name: String): Unit = js.native
  
  /**
    * The uncompressed size of the content.
    */
  var uncompressedSize: Double = js.native
}
