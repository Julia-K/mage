
package mage.game.permanent.token;

import mage.MageObject;
import mage.abilities.Ability;
import mage.cards.Card;
import mage.game.Game;

import java.util.List;
import java.util.UUID;

/**
 * @author ArcadeMode
 */
public interface Token extends MageObject {

    @Override
    Token copy();

    String getTokenDescriptor();

    String getDescription();

    UUID getLastAddedToken();

    List<UUID> getLastAddedTokenIds();

    void addAbility(Ability ability);

    boolean putOntoBattlefield(int amount, Game game, Ability source);

    boolean putOntoBattlefield(int amount, Game game, Ability source, UUID controllerId);

    boolean putOntoBattlefield(int amount, Game game, Ability source, UUID controllerId, boolean tapped, boolean attacking);

    boolean putOntoBattlefield(int amount, Game game, Ability source, UUID controllerId, boolean tapped, boolean attacking, UUID attackedPlayer);

    boolean putOntoBattlefield(int amount, Game game, Ability source, UUID controllerId, boolean tapped, boolean attacking, UUID attackedPlayer, boolean created);

    void setPower(int power);

    void setToughness(int toughness);

    int getTokenType();

    void setTokenType(int tokenType);

    String getOriginalCardNumber();

    void setOriginalCardNumber(String originalCardNumber);

    String getOriginalExpansionSetCode();

    void setOriginalExpansionSetCode(String originalExpansionSetCode);

    Card getCopySourceCard();

    void setCopySourceCard(Card copySourceCard);

    void setExpansionSetCodeForImage(String code);

    boolean updateExpansionSetCode(String setCode);
}
