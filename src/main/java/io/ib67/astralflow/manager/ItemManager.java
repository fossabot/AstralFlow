/*
 *
 *   AstralFlow - Storage utilities for spigot servers.
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

package io.ib67.astralflow.manager;

import io.ib67.astralflow.item.IOreDict;
import io.ib67.astralflow.item.ItemState;
import io.ib67.astralflow.item.factory.AstralItemFactory;
import io.ib67.astralflow.item.factory.ItemRegistry;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.Optional;

public interface ItemManager {
    void registerItem(ItemRegistry item);

    IOreDict getOreDict();

    AstralItemFactory getItemFactory();

    Collection<? extends ItemRegistry> getItemRegistries();

    ItemRegistry getRegistry(String key);

    Optional<ItemRegistry> getRegistry(ItemStack itemStack);

    ItemStack createItem(String key);

    ItemState getState(ItemStack itemStack);
}
