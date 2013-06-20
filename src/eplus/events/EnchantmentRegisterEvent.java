package eplus.events;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.Event;

/**
 * @author Freyja
 *         Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class EnchantmentRegisterEvent extends Event {

    public final Enchantment enchantment;
    public final String modId;

    public EnchantmentRegisterEvent(Enchantment enchantment, String modId) {
        this.enchantment = enchantment;
        this.modId = modId;
    }
}
