/*
 *
 *   AstralFlow - The plugin who is turning bukkit into mod-pack
 *   Copyright (C) 2022 iceBear67
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *   Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free Software
 *   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *   USA
 */

package io.ib67.astralflow.api.external;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;


/**
 * A class that represents a module.
 * <p>
 * Registering your own contents' by subclassing this first.
 * Also check the doc.
 */
@ApiStatus.AvailableSince("0.1.0")
public abstract class AstralModule {
    private final ModuleInfo info;

    public AstralModule(@NotNull ModuleInfo info) {
        Objects.requireNonNull(info, "Module info cannot be null");
        this.info = info;
    }

    /**
     * Called when the module is in INIT phase. You can register your machines and items here.
     */
    public void init() {

    }

    /**
     * Called when your module and astralflow itself is going to be disabled. (Generally server shutdown.)
     */
    public void terminate() {

    }
}
