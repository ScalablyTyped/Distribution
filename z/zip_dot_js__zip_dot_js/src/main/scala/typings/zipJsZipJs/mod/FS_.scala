package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "FS")
@js.native
open class FS_ () extends ZipDirectoryEntry {
  
  /**
    * Returns a {@link ZipEntry} instance from its full filename
    *
    * @param fullname The full filename.
    * @returns The {@link ZipEntry} instance.
    */
  def find(fullname: String): js.UndefOr[ZipEntry] = js.native
  
  /**
    * Returns a {@link ZipEntry} instance from the value of {@link ZipEntry#id}
    *
    * @param id The id of the {@link ZipEntry} instance.
    * @returns The {@link ZipEntry} instance.
    */
  def getById(id: Double): js.UndefOr[ZipEntry] = js.native
  
  /**
    * Moves a {@link ZipEntry} instance and its children into a {@link ZipDirectoryEntry} instance
    *
    * @param entry The {@link ZipEntry} instance to move.
    * @param destination The {@link ZipDirectoryEntry} instance.
    */
  def move(entry: ZipEntry, destination: ZipDirectoryEntry): Unit = js.native
  
  /**
    * Removes a {@link ZipEntry} instance and its children
    *
    * @param entry The {@link ZipEntry} instance to remove.
    */
  def remove(entry: ZipEntry): Unit = js.native
  
  /**
    * The root directory.
    */
  var root: ZipDirectoryEntry = js.native
}
