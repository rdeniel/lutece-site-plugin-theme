/*
 * Copyright (c) 2002-2014, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.theme.business;

import fr.paris.lutece.portal.business.style.Theme;
import fr.paris.lutece.portal.service.plugin.Plugin;
import fr.paris.lutece.util.ReferenceList;

import java.util.Collection;


/**
 * This class provides Data Access methods for Theme objects
 */
public interface IThemeDAO
{
    /**
     * Insert a new record in the table.
     *
     * @param mode The mode object
     * @param plugin Plugin
     */
    void insert( Theme mode, Plugin plugin );

    /**
     * load the data of Level from the table
     *
     * @param strCodeTheme The indentifier of the object Theme
     * @param plugin Plugin
     * @return The Instance of the object Theme
     */
    Theme load( String strCodeTheme, Plugin plugin );

    /**
     * Delete a record from the table
     *
     * @param strCodeTheme The indentifier of the object Theme
     * @param plugin Plugin
     */
    void delete( String strCodeTheme, Plugin plugin );

    /**
     * Update the record in the table
     *
     * @param theme The instance of the Theme to update
     * @param plugin Plugin
     */
    void store( Theme theme, Plugin plugin );

    /**
     * Returns a list of all the themes
     *
     * @param plugin Plugin
     * @return A collection of themes objects
     */
    Collection<Theme> selectThemesList( Plugin plugin );

    /**
     * Returns the list of the themes in form of a reference list
     *
     * @param plugin Plugin
     * @return the themes list in form of a ReferenceList object
     */
    ReferenceList getThemesList( Plugin plugin );

    /**
     * Sets the global theme
     *
     * @param strGlobalTheme The Global Theme
     * @param plugin Plugin
     */
    void setGlobalTheme( String strGlobalTheme, Plugin plugin );

    /**
     * Returns the global theme
     *
     * @param plugin Plugin
     * @return The Global Theme
     */
    Theme getGlobalTheme( Plugin plugin );
}
